package com.example.loginform.ui.theme.composables

import android.graphics.pdf.content.PdfPageGotoLinkContent.Destination
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedTextFieldWithIconForLoginform(lable: String, icon: ImageVector, contentDescription: String?=null, visualTransformation : VisualTransformation = VisualTransformation.None ,state: String, onValueChange:(String) -> Unit) {
    OutlinedTextField(
        value = state,
        onValueChange = onValueChange,
        modifier = Modifier.padding(all = 8.dp).fillMaxWidth(),
        label = { Text(lable) },
        trailingIcon = {
            Icon(icon, contentDescription= contentDescription)
        },
        visualTransformation = visualTransformation
    )
}