package me.farhan.indonesianpresidents.model

import java.io.Serializable

/**
 * @author farhan
 * created at at 13:26 on 07/03/21.
 */
data class President(
    var name: String,
    var bio: String,
    var image: String,
) : Serializable
