package com.cengiztoru.oauthexample

import android.app.AlertDialog
import android.content.Context
import android.webkit.JavascriptInterface


/**
 * Created by Cengiz TORU on 19/08/2020.
 * cengiz.toru@tsoft.com.tr
 */
class WebAppInterface(private val context: Context) {

    @JavascriptInterface
    fun loginSuccess(message: String) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(context)
        builder.setTitle("OAUTH")
        builder.setMessage(message)
        builder.show()

    }

}