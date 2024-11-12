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

import android.content.Context
/**
 * AppContainer adalah antarmuka (interface) yang bertindak sebagai kontainer untuk dependency injection,
 * menyediakan objek `ItemsRepository` yang dapat digunakan di seluruh aplikasi.
 * Dependency injection memungkinkan pengelolaan instance dari berbagai komponen secara modular,
 * sehingga komponen dapat dengan mudah diganti, diuji, atau disesuaikan tanpa perubahan besar.
 */
interface AppContainer {
    val itemsRepository: ItemsRepository
}

/**
 * AppDataContainer adalah implementasi dari antarmuka [AppContainer] yang mengelola dependency injection
 * untuk aplikasi. Dalam hal ini, `AppDataContainer` menyimpan instance dari [OfflineItemsRepository]
 * sebagai `itemsRepository`.
 *
 * @param context Merupakan konteks aplikasi atau aktivitas yang digunakan untuk inisialisasi
 * yang memungkinkan akses ke resource atau basis data jika dibutuhkan.
 *
 * Pada implementasi `itemsRepository`, `by lazy` digunakan untuk menunda inisialisasi sampai
 * benar-benar diperlukan. Ini dapat menghemat sumber daya dan meningkatkan efisiensi aplikasi.
 */
class AppDataContainer(private val context: Context) : AppContainer {
    override val itemsRepository: ItemsRepository by lazy {
        OfflineItemsRepository(InventoryDatabase.getDatabase(context).itemDao())
    }
}

