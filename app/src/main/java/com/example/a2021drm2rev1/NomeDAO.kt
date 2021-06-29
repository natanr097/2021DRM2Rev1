package com.example.a2021drm2rev1

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NomeDAO {

    @Insert
    fun salvar(nome: Nome)

    @Query("SELECT * FROM produto")
    fun listar(): List<Nome>
}