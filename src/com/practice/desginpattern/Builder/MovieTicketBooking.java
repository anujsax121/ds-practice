package com.practice.desginpattern.Builder;

public class MovieTicketBooking {
    private final String movie;     // Name of the Movie
    private final int totalTickets; // Total tickets booked
    private final int popcorn;      // quantity of popcorn
    private final int pizza;        // quantity of Pizza
    private final int burger;       // quantity of burger
    private final int coke;

    MovieTicketBooking(Builder builder) {
        this.movie = builder.movie;
        this.totalTickets = builder.totalTickets;
        this.burger = builder.burger;
        this.coke = builder.coke;
        this.popcorn = builder.popcorn;
        this.pizza = builder.pizza;
    }

    static class Builder {
        private final String movie;     // Name of the Movie
        private final int totalTickets; // Total tickets booked
        private int popcorn;      // Optional Fields quantity of popcorn
        private int pizza;        // quantity of Pizza
        private int burger;       // quantity of burger
        private int coke;

        Builder(String movie, int totalTickets) {
            this.movie = movie;
            this.totalTickets = totalTickets;
        }

        private Builder popcorn() {
            this.popcorn = popcorn;
            return this;
        }

        private Builder coke() {
            this.coke = coke;
            return this;
        }

        private Builder pizza() {
            this.pizza = pizza;
            return this;
        }

        private Builder burger() {
            this.burger = burger;
            return this;
        }

        public MovieTicketBooking build() {
            return new MovieTicketBooking(this);
        }


    }
}
