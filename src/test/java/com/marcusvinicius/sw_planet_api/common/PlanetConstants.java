package com.marcusvinicius.sw_planet_api.common;

import com.marcusvinicius.sw_planet_api.domain.Planet;

public class PlanetConstants {
    public static final Planet PLANET = new Planet(null, "name", "climate", "terrain");
    public static final Planet INVALID_PLANET = new Planet(null, "", "", "");
}
