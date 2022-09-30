package com.example.composelesson

import android.app.LauncherActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelesson.ui.theme.ComposeLessonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (Modifier.verticalScroll(rememberScrollState())){
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
                ListItem(name = "Predator", prof = "Hunter")
            }

        }
    }
}
@Composable
private fun ListItem(name:String, prof:String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .pointerInput(Unit){
                detectTapGestures {
                    Log.d("MyLog", "Long press $it")
                }
            }
            .clickable {
                Log.d("MyLog", "Clicked")
            }
            .padding(10.dp)
            .offset(5.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
        ){
            Box(
                //modifier = Modifier.background(Color.Green)
            )
            {
                Row(
                   // modifier = Modifier.background(Color.Blue),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pedator),
                        contentDescription = "robot",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(5.dp)
                            .size(64.dp)
                            .clip(CircleShape)
                    )
                    Column(
                        Modifier.padding(start = 16.dp)
                       // modifier = Modifier.background(Color.Red)
                    ) {
                        Text(text = name)
                        Text(text = prof)
                    }

                }
            }
              
    }

}
