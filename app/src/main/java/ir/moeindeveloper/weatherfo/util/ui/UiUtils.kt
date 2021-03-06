package ir.moeindeveloper.weatherfo.util.ui

import ir.moeindeveloper.weatherfo.R
import ir.moeindeveloper.weatherfo.data.model.City
import ir.moeindeveloper.weatherfo.data.model.Daily
import ir.moeindeveloper.weatherfo.util.date.DateEvents


fun DateEvents.getGradientBackground(): Int {
    return when(this){
        DateEvents.DAWN -> R.drawable.back_dawn

        DateEvents.MORNING -> R.drawable.back_morning

        DateEvents.NOON -> R.drawable.back_noon

        DateEvents.EVENING -> R.drawable.back_evening

        DateEvents.NIGHT -> R.drawable.back_night
    }
}



interface OnDailyForecastListener {
    fun onSelected(daily: Daily)
}

interface CitySelectListener {
    fun onCitySelected(city: City)
}