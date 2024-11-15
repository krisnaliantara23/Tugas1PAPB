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

package com.example.inventory.data

import kotlinx.coroutines.flow.Flow

/**
definisikan interface ItemsRepository sebagai abstraksi yang berisi fungsi-fungsi untuk mengakses data Item.
 */
interface ItemsRepository {
    /**
     * Mengambil semua data item.
     */
    fun getAllItemsStream(): Flow<List<Item>>

    /**
     * Mengambil data item yang sesuai dengan [id].
     */
    fun getItemStream(id: Int): Flow<Item?>

    /**
     * Menambahkan data item.
     */
    suspend fun insertItem(item: Item)

    /**
     * Menghapus data item.
     */
    suspend fun deleteItem(item: Item)

    /**
     * Mengupdate data item.
     */
    suspend fun updateItem(item: Item)
}