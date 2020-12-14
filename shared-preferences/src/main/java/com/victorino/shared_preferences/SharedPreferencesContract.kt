package com.victorino.shared_preferences

import android.content.Context

interface SharedPreferencesContract {
    companion object{
       fun getInstance(context: Context) : SharedPreferencesImpl {
         return SharedPreferencesImpl(context)
       }
    }
}