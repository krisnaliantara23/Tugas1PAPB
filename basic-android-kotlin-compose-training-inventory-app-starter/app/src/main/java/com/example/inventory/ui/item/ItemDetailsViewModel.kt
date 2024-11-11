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

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.inventory.data.ItemsRepository
/**
 * ViewModel ini bertanggung jawab untuk mengelola data item tertentu dan berinteraksi dengan [ItemsRepository].
 * Mengambil data item berdasarkan ID yang disediakan untuk ditampilkan dalam `ItemDetailsScreen`.
 * ViewModel ini memanfaatkan `SavedStateHandle` untuk mendapatkan nilai `itemId`
 * yang dipasok melalui argumen navigasi, dan menggunakannya untuk mencari data spesifik dari repository.
 *
 * @param savedStateHandle Menyimpan informasi status untuk mempertahankan data UI
 *                         ketika terjadi perubahan konfigurasi atau aktivitas dijalankan kembali.
 */
class ItemDetailsViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    // Mengambil itemId dari savedStateHandle, yang memungkinkan aplikasi untuk mengakses
    // item tertentu berdasarkan ID yang diberikan sebagai argumen navigasi.
    private val itemId: Int = checkNotNull(savedStateHandle[ItemDetailsDestination.itemIdArg])

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L // Waktu timeout untuk operasi data asinkron, jika diperlukan.
    }
}

