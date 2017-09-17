package com.innopolis.outside.model.entity

/**
 * @author Sergey Pinkevich
 */
data class City(val id: Long,
                val name: String,
                val coord: Coordinates,
                val country: String,
                val population: Int)