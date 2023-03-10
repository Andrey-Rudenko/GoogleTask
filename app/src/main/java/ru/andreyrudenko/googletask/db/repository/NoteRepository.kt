package ru.andreyrudenko.googletask.db.repository

import androidx.lifecycle.LiveData
import ru.andreyrudenko.googletask.model.NoteModel

interface NoteRepository {
    val allNotes: LiveData<List<NoteModel>>
    suspend fun insertNote(noteModel: NoteModel, onSuccess:() -> Unit)
    suspend fun deleteNote(noteModel: NoteModel, onSuccess:() -> Unit)
}