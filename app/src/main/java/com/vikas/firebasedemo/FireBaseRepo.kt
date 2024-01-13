package com.vikas.firebasedemo

import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

class FireBaseRepo {
    val db = Firebase.firestore
    val x = hashMapOf(
        "count" to 4
    )
    fun Count() {
        db.collection("Vikas")
            .document("Count")
            .set(x)

    }
}