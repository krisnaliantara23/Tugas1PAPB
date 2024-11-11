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

package com.example.inventory.ui.home

import androidx.lifecycle.ViewModel
import com.example.inventory.data.Item

/**
 * ViewModel `HomeViewModel` menyediakan data item dari database Room.
 * ViewModel ini berperan sebagai penghubung antara lapisan UI dan database,
 * memastikan bahwa data tetap ada saat layar diputar atau saat konfigurasi berubah.
 *
 * - `TIMEOUT_MILLIS`: Konstanta yang mendefinisikan batas waktu untuk operasi database,
 *   sehingga pengguna diberi informasi jika ada keterlambatan dalam mengambil data.
 */
class HomeViewModel : ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}

/**
 * `HomeUiState` adalah kelas data yang merepresentasikan status UI untuk layar beranda.
 * `itemList` adalah daftar item yang akan ditampilkan dalam UI, defaultnya adalah daftar kosong.
 *
 * Ini memungkinkan ViewModel untuk mengirimkan status data secara efisien ke komponen UI,
 * memisahkan status data dari UI untuk memungkinkan alur data yang lebih bersih.
 */
data class HomeUiState(val itemList: List<Item> = listOf())
