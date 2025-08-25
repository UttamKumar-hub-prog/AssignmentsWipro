import { Component } from '@angular/core';
import { MusicPlayerComponent } from "./music-player/music-player.component";
import { FeedbackComponent } from "./feedback/feedback.component";
import { MovieListAppComponent } from "./movie-list-app/movie-list-app.component";


@Component({
  selector: 'app-root',
  imports: [MusicPlayerComponent, FeedbackComponent, MovieListAppComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Feedback';

}


