package com.example.onboarding_presentation.nutrient_goal

sealed class NutrientGoalEvent {
    data class OnCarbRatioEnter(val ratio: String): NutrientGoalEvent()
    data class OnProteintRatioEnter(val ratio: String): NutrientGoalEvent()
    data class OnFatRatioRatioEnter(val ratio: String): NutrientGoalEvent()
    object OnNextClick: NutrientGoalEvent()
}
