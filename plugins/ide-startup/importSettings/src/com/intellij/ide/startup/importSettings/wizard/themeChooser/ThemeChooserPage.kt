// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.ide.startup.importSettings.wizard.themeChooser

import com.intellij.ide.startup.importSettings.ImportSettingsBundle
import com.intellij.ide.startup.importSettings.chooser.ui.OnboardingPage
import com.intellij.ide.startup.importSettings.chooser.ui.UiUtils
import com.intellij.ide.startup.importSettings.chooser.ui.WizardController
import com.intellij.ide.startup.importSettings.chooser.ui.WizardPagePane
import com.intellij.ide.startup.importSettings.data.ThemeService
import com.intellij.openapi.util.SystemInfo
import com.intellij.platform.ide.bootstrap.StartupWizardStage
import com.intellij.ui.dsl.builder.SegmentedButton
import com.intellij.ui.dsl.builder.panel
import com.intellij.util.ui.JBUI
import java.awt.BorderLayout
import java.awt.Component
import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.*

class ThemeChooserPage(val controller: WizardController) : OnboardingPage {
  private val service = controller.service.getThemeService()

  private val pages = mutableListOf<SchemePane>()
  private lateinit var segmentedButton: SegmentedButton<ThemeService.Theme>
  private val schemesPane = JPanel(GridBagLayout())
  private val contentPage: JComponent

  private var activeScheme: SchemePane

  private val buttonGroup = ButtonGroup()

  init {

    val list = service.schemesList
    assert(list.isNotEmpty())
    assert(service.themeList.isNotEmpty())

    list.forEachIndexed { index, sc ->
      val pane = SchemePane(sc).apply {
        this.pane.addMouseListener(object : MouseAdapter() {
          override fun mousePressed(e: MouseEvent?) {
            activePane(this@apply)
          }
        })
      }
      val gbc = GridBagConstraints()

      gbc.insets = JBUI.insetsRight(if(index < list.size - 1) 9 else 0)
      gbc.weightx = 1.0
      gbc.weighty = 1.0
      gbc.fill = GridBagConstraints.BOTH

      pages.add(pane)
      schemesPane.add(pane.pane, gbc)
      buttonGroup.add(pane.jRadioButton)
      pane.jRadioButton.addActionListener {
        activePane(pane)
      }
    }

    val centralPane = JPanel(BorderLayout(0, 0)).apply {
      val pane = panel {
        row {
          @Suppress("DialogTitleCapitalization")
          label(ImportSettingsBundle.message("theme.page.title")).applyToComponent {
            font = UiUtils.HEADER_FONT
            border = UiUtils.HEADER_BORDER
          }.resizableColumn()
          segmentedButton = segmentedButton(service.themeList) { text = it.themeName }
            .whenItemSelected { service.currentTheme = it }.apply {
              selectedItem = service.currentTheme
            }
        }
      }

      add(pane, BorderLayout.NORTH)
      add(schemesPane, BorderLayout.CENTER)

      border = UiUtils.CARD_BORDER
    }

    activeScheme = pages[0]
    activePane(activeScheme)

    val backAction = controller.goBackAction?.let {
      controller.createButton(ImportSettingsBundle.message("import.settings.back")) {
        it.invoke()
      }
    }

    val continueAction = controller.createDefaultButton(ImportSettingsBundle.message("wizard.button.continue")) {
      controller.goToKeymapPage()
    }

    val buttons: List<JButton> = backAction?.let {
      if (SystemInfo.isMac) {
        listOf(backAction, continueAction)
      }
      else listOf(continueAction, backAction)
    } ?: listOf(continueAction)

    contentPage = WizardPagePane(centralPane, buttons)
  }

  fun activePane(schemePane: SchemePane) {
    assert(pages.isNotEmpty() && pages.contains(schemePane))

    activeScheme.active = false
    activeScheme = schemePane
    activeScheme.active = true

    service.updateScheme(schemePane.scheme.id)
  }

  override val content: JComponent = contentPage
  override val stage: StartupWizardStage = StartupWizardStage.WizardThemePage

  override fun confirmExit(parentComponent: Component?): Boolean {
    return true
  }
}