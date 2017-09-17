package com.innopolis.outside.model.entity

/**
 * @author Sergey Pinkevich
 */
data class Weather(val id: Long,
                   val main: String,
                   val description: String,
                   val icon: String)