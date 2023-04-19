package com.example.pokemon.Retrofit;

import io.reactivex.Observable;

import com.example.pokemon.Model.Pokedex;
import retrofit2.http.GET;

public interface IPokemonDex {

     @GET("pokedex.json")

     Observable<Pokedex> getListPokemon();
}
