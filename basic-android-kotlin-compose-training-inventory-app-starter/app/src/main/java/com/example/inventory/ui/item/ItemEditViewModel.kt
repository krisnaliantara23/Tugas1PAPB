/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.inventory.ui.item

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.inventory.data.ItemsRepository
/**
 * ViewModel ini bertanggung jawab untuk mengelola dan memperbarui data item yang akan diedit.
 * Berinteraksi dengan `ItemsRepository` untuk menyimpan perubahan yang dilakukan pengguna.
 * `SavedStateHandle` digunakan untuk mendapatkan `itemId`, memastikan ViewModel mengakses data item
 * yang sesuai, baik untuk menampilkan data awal maupun untuk menyimpan perubahan yang diperbarui.
 */
class ItemEditViewModel(
    savedStateHandle: SavedStateHandle,
) : ViewModel() {

    /**
     * Menyimpan status UI item saat ini untuk pengeditan.
     * Status ini memungkinkan UI untuk merender tampilan item dan memantau perubahan yang terjadi pada input.
     */
    var itemUiState by mutableStateOf(ItemUiState())
        private set

    // Mendapatkan ID item dari savedStateHandle yang dikirim melalui argumen navigasi.
    private val itemId: Int = checkNotNull(savedStateHandle[ItemEditDestination.itemIdArg])

    /**
     * Fungsi ini melakukan validasi terhadap input pengguna sebelum data disimpan.
     * Mengecek apakah semua field yang diperlukan telah terisi.
     *
     * @param uiState Berisi data detail item yang sedang diedit.
     * @return Boolean true jika semua field tidak kosong, false jika ada field yang kosong.
     */
    private fun validateInput(uiState: ItemDetails = itemUiState.itemDetails): Boolean {
        return with(uiState) {
            name.isNotBlank() && price.isNotBlank() && quantity.isNotBlank()
        }
    }
}
