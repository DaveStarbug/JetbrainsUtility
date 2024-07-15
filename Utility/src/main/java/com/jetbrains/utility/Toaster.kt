package com.jetbrains.utility

import android.content.Context
import android.widget.Toast

class Toaster(_context: Context) {

    val context = _context

    fun showToast(message: String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }


}