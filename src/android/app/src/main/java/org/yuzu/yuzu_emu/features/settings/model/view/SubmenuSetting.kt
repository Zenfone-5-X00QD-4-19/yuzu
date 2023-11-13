// SPDX-FileCopyrightText: 2023 yuzu Emulator Project
// SPDX-License-Identifier: GPL-2.0-or-later

package org.yuzu.yuzu_emu.features.settings.model.view

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import org.yuzu.yuzu_emu.features.settings.model.Settings

class SubmenuSetting(
    @StringRes titleId: Int,
    @StringRes descriptionId: Int,
    @DrawableRes val iconId: Int,
    val menuKey: Settings.MenuTag
) : SettingsItem(emptySetting, titleId, descriptionId) {
    override val type = TYPE_SUBMENU
}
