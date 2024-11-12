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

import androidx.room.Entity
import androidx.room.PrimaryKey
/**
 * Item adalah kelas data yang merepresentasikan satu entri (row) dalam tabel basis data.
 * Kelas ini memiliki atribut-atribut yang merepresentasikan properti dari item di dalam inventaris,
 * yaitu `id`, `name`, `price`, dan `quantity`.
 *
 * @property id Identifier unik dari item, disetel secara otomatis dengan nilai default 0.
 * @property name Nama dari item, bertipe String.
 * @property price Harga dari item, bertipe Double.
 * @property quantity Jumlah atau kuantitas dari item yang tersedia, bertipe Int.
 *
 * Kelas data ini umumnya dipetakan ke tabel dalam database Room, dengan setiap properti menjadi kolom.
 */
@Entity(tableName = "items")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)

