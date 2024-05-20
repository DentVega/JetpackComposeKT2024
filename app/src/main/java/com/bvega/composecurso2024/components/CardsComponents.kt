import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bvega.composecurso2024.components.NewImageViewComponent
import com.bvega.composecurso2024.components.NewOutlinedTextFieldComponent
import com.bvega.composecurso2024.components.NewTextField
import com.bvega.composecurso2024.components.NewTextView2

@Preview(showBackground = true)
@Composable
private fun CardsComponents() {
    NewCardComponent()
}

@Composable
fun NewCardComponent() {
    newCardC()
}

@Composable
fun newCardC() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)) {
        Column(modifier = Modifier.padding(8.dp)) {
            NewTextView2()
            CustomDivider()
            NewTextField()
            NewOutlinedTextFieldComponent()
            NewImageViewComponent()
        }
    }
}

@Composable
fun CustomDivider() {
    Spacer(modifier = Modifier.height(8.dp))
    Divider(modifier = Modifier.fillMaxWidth())
    Spacer(modifier = Modifier.height(16.dp))
}
