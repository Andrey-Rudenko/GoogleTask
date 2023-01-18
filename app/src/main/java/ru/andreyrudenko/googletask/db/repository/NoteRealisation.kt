package ru.andreyrudenko.googletask.db.repository

import androidx.lifecycle.LiveData
import ru.andreyrudenko.googletask.db.dao.NoteDao
import ru.andreyrudenko.googletask.model.NoteModel

class NoteRealisation(private val noteDao: NoteDao) : NoteRepository {
    override val allNotes: LiveData<List<NoteModel>>
        get() = noteDao.getAllNotes()

    override suspend fun insertNote(noteModel: NoteModel, onSuccess: () -> Unit) {
        noteDao.insert(noteModel)
        onSuccess()
    }

    override suspend fun deleteNote(noteModel: NoteModel, onSuccess: () -> Unit) {
        noteDao.delete(noteModel)
        onSuccess
    }

}