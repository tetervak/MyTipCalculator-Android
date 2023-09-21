package ca.tetervak.mytipcalculator.ui.calculator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ca.tetervak.mytipcalculator.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculatorScreen(){

    val costInput: MutableState<String> = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = stringResource(R.string.tip_calculator),
            fontSize = 24.sp,
            color = colorResource(id = R.color.pink_600)
        )
        TextField(
            label = { Text ( text = stringResource(R.string.service_cost))},
            value = costInput.value,
            onValueChange = { v -> costInput.value = v},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            modifier = Modifier.padding(16.dp).sizeIn(minWidth = 256.dp)
        )
    }
}




@Preview
@Composable
fun CalculatorScreenPreview(){
    CalculatorScreen()
}