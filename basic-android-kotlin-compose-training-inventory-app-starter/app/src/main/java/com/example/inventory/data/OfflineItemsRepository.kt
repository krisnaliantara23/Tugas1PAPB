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

/**
 * OfflineItemsRepository adalah implementasi dari antarmuka [ItemsRepository].
 * Implementasi ini dirancang untuk mengelola data item secara offline, yang mungkin melibatkan
 * penyimpanan data secara lokal pada perangkat, seperti menggunakan Room sebagai database.
 *
 * Dengan menggunakan [OfflineItemsRepository], aplikasi tetap dapat bekerja meskipun tidak terhubung
 * ke internet, dan operasi CRUD (Create, Read, Update, Delete) pada data item masih dapat dilakukan.
 */
class OfflineItemsRepository : ItemsRepository
