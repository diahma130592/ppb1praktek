import androidx.room.*
@Dao
interface NoteDao {
    @Insert
    suspend fun addNote(note: Note)
    @Update
    suspend fun updateNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
    @Query(&quot;SELECT * FROM note&quot;)
    suspend fun getNotes(): List&lt;Note&gt;
    @Query(&quot;SELECT * FROM note WHERE id=:note_id&quot;)
    suspend fun getNote(note_id: Int): List&lt;Note&gt;
}
