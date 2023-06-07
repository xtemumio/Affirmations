package com.example.affirmations.data
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource (){
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.Affirmations1,R.drawable.image1),
            Affirmation(R.string.Affirmations2,R.drawable.image2),
            Affirmation(R.string.Affirmations3,R.drawable.image3),
            Affirmation(R.string.Affirmations4,R.drawable.image4),
            Affirmation(R.string.Affirmations5,R.drawable.image5),
            Affirmation(R.string.Affirmations6,R.drawable.image6),
            Affirmation(R.string.Affirmations7,R.drawable.image7),
            Affirmation(R.string.Affirmations8,R.drawable.image8),
            Affirmation(R.string.Affirmations9,R.drawable.image9),
            Affirmation(R.string.Affirmations10,R.drawable.image10)
        )

    }
}