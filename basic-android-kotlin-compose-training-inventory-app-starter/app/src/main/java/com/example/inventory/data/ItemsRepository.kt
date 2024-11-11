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
 * ItemsRepository adalah antarmuka (interface) yang menentukan operasi dasar pada data Item,
 * seperti insert, update, delete, dan retrieve. Antarmuka ini memungkinkan penggunaan pola Repository,
 * yang bertindak sebagai lapisan abstraksi antara logika bisnis aplikasi dan lapisan data.
 *
 * Implementasi dari antarmuka ini dapat berbeda-beda tergantung pada sumber data yang digunakan,
 * misalnya implementasi untuk database lokal menggunakan Room atau sumber data jarak jauh.
 *
 * Penggunaan Repository memungkinkan kode lebih modular dan memudahkan penggantian sumber data
 * tanpa mengubah logika aplikasi yang menggunakan repository.
 */
interface ItemsRepository
