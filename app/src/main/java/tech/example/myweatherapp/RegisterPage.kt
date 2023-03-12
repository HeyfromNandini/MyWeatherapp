package tech.example.myweatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tech.example.myweatherapp.ui.theme.MyWeatherappTheme
import tech.example.myweatherapp.ui.theme.whiteBackground
import android.graphics.fonts.Font
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Password
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontSynthesis.Companion.Weight
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegisterPage()
//
        }
    }
    @Composable
    fun RegisterPage() {
        val image = painterResource(id = R.drawable.register)
        var nameValue by remember { mutableStateOf("") }
        var emailValue by remember { mutableStateOf("") }
        var phoneValue by remember { mutableStateOf("") }
        var passwordValue by remember { mutableStateOf("") }
        var confirmPasswordValue by remember { mutableStateOf("") }
//
        var passwordVisibility by remember { mutableStateOf(false) }
        var confirmPasswordVisibility by remember { mutableStateOf(false) }

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter)
        {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White), contentAlignment = Alignment.TopCenter
            ) {

                Image(painter = painterResource(id = R.drawable.register), contentDescription = "")
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.70f)
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                    .background(whiteBackground).verticalScroll(rememberScrollState())
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "SIGN IN",
                        fontSize = 30.sp,
                    )
                }
                Spacer(modifier = Modifier.padding(20.dp))
                Column(horizontalAlignment = Alignment.CenterHorizontally)
                {
                    OutlinedTextField(
                        value = nameValue, onValueChange = { nameValue = it },
                        label = { Text(text = "Name") },
                        placeholder = { Text(text = "Name") },
                        singleLine = true,
                        modifier = Modifier.fillMaxSize(0.8f)
                    )
                    OutlinedTextField(
                        value = emailValue, onValueChange = { nameValue = it },
                        label = { Text(text = "Email Address") },
                        placeholder = { Text(text = "Email Address") },
                        singleLine = true,
                        modifier = Modifier.fillMaxSize(0.8f)
                    )

                    OutlinedTextField(
                        value = phoneValue, onValueChange = { nameValue = it },
                        label = { Text(text = "Phone") },
                        placeholder = { Text(text = "Phone") },
                        singleLine = true,
                        modifier = Modifier.fillMaxSize(0.8f),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
                    )
                    OutlinedTextField(
                        value = passwordValue, onValueChange = { passwordValue = it },
                        label = { Text(text = "Password") },
                        placeholder = { Text(text = "Password") },
                        singleLine = true,
                        modifier = Modifier.fillMaxSize(0.8f)

                    )
                    OutlinedTextField(
                        value = confirmPasswordValue, onValueChange = { confirmPasswordValue = it },
                        label = { Text(text = "Confirm Password") },
                        placeholder = { Text(text = "Confirm Password") },
                        singleLine = true,
                        modifier = Modifier.fillMaxSize(0.8f)
                    )
                    Spacer(modifier = Modifier.padding(20.dp))
                    Button(
                        onClick = { }, modifier = Modifier
                            .fillMaxWidth(0.8f)
                            .height(50.dp)
                    )
                    {
                        Text(text = "Sign Up", fontSize = 20.sp)
                    }
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(
                        text = "Login Instead",
//                        modifier = Modifier.clickable(onClick = {
//                        navController.navigate("login_page"){
//                            popUpTp = navController.graph.startDestination
//                            launchSingleTap =true

                    )
                    Spacer(modifier = Modifier.padding(20.dp))

                }
            }
        }
    }
}





