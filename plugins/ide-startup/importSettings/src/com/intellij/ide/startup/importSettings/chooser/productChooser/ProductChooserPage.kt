// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.ide.startup.importSettings.chooser.productChooser

import com.intellij.icons.AllIcons
import com.intellij.ide.startup.importSettings.ImportSettingsBundle
import com.intellij.ide.startup.importSettings.chooser.ui.ImportSettingsController
import com.intellij.ide.startup.importSettings.chooser.ui.OnboardingPage
import com.intellij.ide.startup.importSettings.chooser.ui.UiUtils
import com.intellij.ide.startup.importSettings.data.SettingsService
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.ActionPlaces
import com.intellij.openapi.actionSystem.DefaultActionGroup
import com.intellij.openapi.actionSystem.impl.ActionToolbarImpl
import com.intellij.openapi.actionSystem.toolbarLayout.ToolbarLayoutStrategy
import com.intellij.openapi.rd.createLifetime
import com.intellij.platform.ide.bootstrap.StartupWizardStage
import com.intellij.ui.components.panels.VerticalLayout
import com.intellij.util.ui.JBFont
import com.intellij.util.ui.JBUI
import com.jetbrains.rd.util.lifetime.intersect
import java.awt.*
import javax.swing.*

class ProductChooserPage(val controller: ImportSettingsController) : OnboardingPage {

  override val stage = StartupWizardStage.ProductChoicePage
  override fun confirmExit(parentComponent: Component?): Boolean {
    return true
  }

  private val lifetime = controller.lifetime.createNested().intersect(this.createLifetime())

  private val accountLabel = JLabel("user.name").apply {
    icon = AllIcons.General.User

    val settService = SettingsService.getInstance()

    settService.jbAccount.advise(lifetime) {
      isVisible = it != null
      if (!isVisible) {
        return@advise
      }

      text = it?.loginName
    }

  }

  private val pane = JPanel(VerticalLayout(JBUI.scale(26), SwingConstants.CENTER)).apply {
    add(JLabel(ImportSettingsBundle.message("choose.product.title")).apply {
      font = JBFont.h1()
    })
  }


  init {
    val group = DefaultActionGroup()
    group.isPopup = false

    group.add(SyncStateAction())
    group.add(SyncChooserAction(controller))
    group.add(JbChooserAction(controller))
    group.add(ExpChooserAction(controller))
    group.add(SkipImportAction { controller.skipImportAction.invoke() })

    val act = ActionManager.getInstance().createActionToolbar(ActionPlaces.IMPORT_SETTINGS_DIALOG, group, false).apply {
      if (this is ActionToolbarImpl) {

        setMinimumButtonSize {
          JBUI.size(UiUtils.DEFAULT_BUTTON_WIDTH, UiUtils.DEFAULT_BUTTON_HEIGHT)
        }
        setMiniMode(false)
        layoutStrategy = ToolbarLayoutStrategy.NOWRAP_STRATEGY
      }
    }
    act.targetComponent = pane

    pane.add(act.component)

    SwingUtilities.invokeLater {
      act.component.requestFocus()
    }
  }

  private val south = JPanel(BorderLayout()).apply {
    val group = DefaultActionGroup()
    group.add(OtherOptions(controller))

    val at = ActionToolbarImpl(ActionPlaces.IMPORT_SETTINGS_DIALOG, group, true)
    at.setReservePlaceAutoPopupIcon(false)
    at.targetComponent = pane

    add(accountLabel, BorderLayout.WEST)
    add(at.component, BorderLayout.EAST)

    border = JBUI.Borders.empty(0, 20, 10, 7)
    preferredSize = Dimension(preferredSize.width, JBUI.scale(47))
  }

  private val contentPage = JPanel(GridBagLayout()).apply {
    val gbc = GridBagConstraints()
    gbc.gridx = 0
    gbc.gridy = 0
    gbc.weightx = 1.0
    gbc.weighty = 1.0
    gbc.fill = GridBagConstraints.NONE
    add(pane, gbc)

    gbc.gridy = 1
    gbc.weighty = 0.0
    gbc.anchor = GridBagConstraints.SOUTH
    gbc.fill = GridBagConstraints.HORIZONTAL
    add(south, gbc)

    border = JBUI.Borders.empty()
  }

  override val content: JComponent = contentPage
}