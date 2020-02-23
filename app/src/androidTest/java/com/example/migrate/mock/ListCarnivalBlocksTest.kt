package com.example.migrate.mock

import com.example.migrate.model.CarnivalBlockModel
import org.junit.Assert.assertEquals
import org.junit.Test

internal class ListCarnivalBlocksTest {
    private val actualCarnivalBlocksList: List<CarnivalBlockModel> = MockCarnivalBlocks();

    @Test
    fun shouldBeReturnThreeElementsInArray() {
        assertEquals(3,actualCarnivalBlocksList.size);
    }

    @Test
    fun shouldBeReturnListOfBlocksWithName(){
        var carnivalBlockName = "Bloco Pablo";
        var actualNameCarnivalBlock = actualCarnivalBlocksList[1].name;
        assertEquals(carnivalBlockName,actualNameCarnivalBlock);
    }
}