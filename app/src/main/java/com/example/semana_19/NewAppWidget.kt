package com.example.semana_19

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews


class NewAppWidget : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {

        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    override fun onEnabled(context: Context) {

    }

    override fun onDisabled(context: Context) {

    }
}

internal fun updateAppWidget(
    context: Context,
    appWidgetManager: AppWidgetManager,
    appWidgetId: Int
) {
    val  canvella:PendingIntent=Intent(context,MainActivity2::class.java).let {
        intent ->  PendingIntent.getActivity(context,0,intent,0)
    }
    val  notas:PendingIntent=Intent(context,MainActivity3::class.java).let {
            intent ->  PendingIntent.getActivity(context,0,intent,0)
    }

    val views = RemoteViews(context.packageName, R.layout.new_app_widget)
        .apply { setOnClickPendingIntent(R.id.canva,canvella) }
        .apply { setOnClickPendingIntent(R.id.note,notas) }



    appWidgetManager.updateAppWidget(appWidgetId, views)
}