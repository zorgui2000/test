import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.houssem.test.MainActivity
import com.houssem.test.R
import com.houssem.test.databinding.InterviewBinding

class Interview : AppCompatActivity() {
    private lateinit var mInterviewBinding: InterviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mInterviewBinding = InterviewBinding.inflate(layoutInflater)
        setContentView(mInterviewBinding.root)

        // Récupérez une référence au bouton "Next" en utilisant l'ID que vous avez attribué dans le fichier XML
        val buttonNext = mInterviewBinding.root.findViewById<Button>(R.id.buttonNext)

        // Ajoutez un gestionnaire de clic pour le bouton "Next"
        buttonNext.setOnClickListener {
            // Lorsque le bouton "Next" est cliqué, lancez une nouvelle activité
            val intent = Intent(this, MainActivity::class.java) // Remplacez "NouvelleActivite" par le nom de la nouvelle activité que vous souhaitez lancer
            startActivity(intent)
        }
    }
}
