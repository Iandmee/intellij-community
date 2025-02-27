// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.ide.ui.laf;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import com.intellij.ide.ui.LafReference;
import com.intellij.ide.ui.laf.darcula.ui.ComboBoxButtonUI;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.ui.CollectionComboBoxModel;
import com.intellij.ui.components.BasicOptionButtonUI;
import com.intellij.ui.components.DarculaSearchFieldWithExtensionUI;
import com.intellij.ui.components.DefaultLinkButtonUI;
import com.intellij.ui.tree.ui.DefaultTreeUI;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

final class HeadlessLafManagerImpl extends LafManager {
  HeadlessLafManagerImpl() {
    UIDefaults defaults = UIManager.getLookAndFeelDefaults();
    defaults.put("OptionButtonUI", BasicOptionButtonUI.class.getCanonicalName());
    defaults.put("LinkButtonUI", DefaultLinkButtonUI.class.getName());
    defaults.put("SearchFieldWithExtensionUI", DarculaSearchFieldWithExtensionUI.class.getName());
    defaults.put("TreeUI", DefaultTreeUI.class.getName());
    defaults.put("ComboBoxButtonUI", ComboBoxButtonUI.class.getName());
  }

  @Override
  public UIManager.LookAndFeelInfo @NotNull [] getInstalledLookAndFeels() {
    return new UIManager.LookAndFeelInfo[0];
  }

  @Override
  public Sequence<UIThemeLookAndFeelInfo> getInstalledThemes() {
    return SequencesKt.emptySequence();
  }

  @Override
  public UIManager.LookAndFeelInfo getCurrentLookAndFeel() {
    return null;
  }

  @Override
  public UIThemeLookAndFeelInfo getCurrentUIThemeLookAndFeel() {
    return null;
  }

  @Override
  public LafReference getLookAndFeelReference() {
    return null;
  }

  @Override
  public ListCellRenderer<LafReference> getLookAndFeelCellRenderer(JComponent component) {
    return null;
  }

  @Override
  public @NotNull JComponent getSettingsToolbar() {
    return new JComponent() {};
  }

  @Override
  public void setCurrentLookAndFeel(@NotNull UIThemeLookAndFeelInfo lookAndFeelInfo, boolean lockEditorScheme) { }

  @Override
  public @NotNull CollectionComboBoxModel<LafReference> getLafComboBoxModel() {
    return new CollectionComboBoxModel<>();
  }

  @Override
  public UIThemeLookAndFeelInfo findLaf(@NotNull String themeId) {
    return null;
  }

  @Override
  public void updateUI() { }

  @Override
  public void repaintUI() { }

  @Override
  public boolean getAutodetect() {
    return false;
  }

  @Override
  public void setAutodetect(boolean value) {}

  @Override
  public boolean getAutodetectSupported() {
    return false;
  }

  @Override
  public void setPreferredDarkLaf(@NotNull UIThemeLookAndFeelInfo value) { }

  @Override
  public void setPreferredLightLaf(@NotNull UIThemeLookAndFeelInfo value) { }

  @Override
  public void setRememberSchemeForLaf(boolean rememberSchemeForLaf) { }

  @Override
  public void rememberSchemeForLaf(@NotNull EditorColorsScheme scheme) { }

  @Override
  public void addLafManagerListener(@NotNull LafManagerListener listener) { }

  @Override
  public void removeLafManagerListener(@NotNull LafManagerListener listener) { }

  @Override
  public UIThemeLookAndFeelInfo getDefaultLightLaf() { return null; }

  @Override
  public UIThemeLookAndFeelInfo getDefaultDarkLaf() { return null; }
}