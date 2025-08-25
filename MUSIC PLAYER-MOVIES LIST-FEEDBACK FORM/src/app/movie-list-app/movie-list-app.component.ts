import { Component } from '@angular/core';
import { MaterialModule } from "../material.module";
import { CommonModule } from '@angular/common';
 

@Component({
  selector: 'app-movie-list-app',
  imports: [MaterialModule, CommonModule],
  templateUrl: './movie-list-app.component.html',
  styleUrl: './movie-list-app.component.css'
})
export class MovieListAppComponent {
  selectedGenre = 'All';

  movies = [
    { title: 'Inception', genre: 'Sci-Fi', rating: 3, description: 'Dream within a dream.', poster: "https://2.bp.blogspot.com/-xFYEth1IzNg/T7aRDDExXfI/AAAAAAAABxs/UUKfDL0Tgw0/s1600/inception-poster.jpg" },
    { title: 'Titanic', genre: 'Romance', rating: 4, description: 'A love story on the doomed ship.', poster: 'https://tse2.mm.bing.net/th/id/OIP.XqG7LUbIi8q7DdiRLAliLgHaK5?rs=1&pid=ImgDetMain&o=7&rm=3' },
    { title: 'Avengers', genre: 'Action', rating: 5, description: 'Earth’s mightiest heroes unite.', poster: 'https://w0.peakpx.com/wallpaper/223/644/HD-wallpaper-ultimate-avengers-marvel.jpg' },
    { title: 'Guntur Kaaram', genre: 'Drama', rating: 5, description: 'Jai Babuuuu', poster: 'https://i.pinimg.com/736x/ef/d0/5f/efd05f7ad8b45e345a92baae07974d39.jpg' },
    { title: 'Badri', genre: 'Drama', rating: 5, description: 'Jai Kalyan Babuuuu', poster: 'https://m.media-amazon.com/images/M/MV5BZjg5OWY5MDktZDFhMi00NDc3LTlhNTItNWU3ZWE3NDYxNTgyXkEyXkFqcGdeQXVyMjk4MjEyNTg@._V1_FMjpg_UX1000_.jpg' }
  ];

  genres = ['All', ...new Set(this.movies.map(m => m.genre))];

  get averageRating() {
    return (this.movies.reduce((a, m) => a + m.rating, 0) / this.movies.length) || 0;
  }

  getStars(rating: number) {
    return Array(rating).fill(0);
  }
}