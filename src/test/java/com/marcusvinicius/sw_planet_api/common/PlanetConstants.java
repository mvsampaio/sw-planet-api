package com.marcusvinicius.sw_planet_api.common;

import com.marcusvinicius.sw_planet_api.domain.Planet;

import java.util.List;

public class PlanetConstants {
    public static final Planet PLANET = new Planet(null, "name", "climate", "terrain");
    public static final Planet INVALID_PLANET = new Planet(null, "", "", "");

    public static final Planet TATOOINE = new Planet(1L, "Tatooine", "arid", "desert");
    public static final Planet ALDERAAN = new Planet(2L, "Alderaan", "temperate", "grasslands, mountains");
    public static final Planet YAVINIV = new Planet(3L, "Yavin IV", "temperate, tropical", "jungle, rainforests");
    public static final List<Planet> PLANETS = List.of(TATOOINE, ALDERAAN, YAVINIV);
}
