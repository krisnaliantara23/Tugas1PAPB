package com.example.inventory.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

/**
 * Mendefinisikan interface ItemDao dengan anotasi @Dao
 * untuk Room Database yang menyediakan fungsi-fungsi CRUD:
 * @insert, @update, dan @delete item, serta getItem untuk mendapatkan item berdasarkan id,
 * dan getAllItems untuk mengambil semua item terurut berdasarkan name secara ascending atau.
 * dari A - Z.
 */
@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)

    @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)

    @Query("SELECT * from items WHERE id = :id")
    fun getItem(id: Int): Flow<Item>

    @Query("SELECT * from items ORDER BY name ASC")
    fun getAllItems(): Flow<List<Item>>
}