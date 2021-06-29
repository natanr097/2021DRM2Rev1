package com.example.a2021drm2rev1

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Nome (val nome: String,
                 @PrimaryKey(autoGenerate = true)
                 val id: Int = 0) {
}