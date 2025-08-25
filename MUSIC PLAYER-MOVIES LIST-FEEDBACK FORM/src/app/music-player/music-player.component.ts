import { Component } from '@angular/core';
import { MaterialModule } from '../material.module';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-music-player',
  imports: [MaterialModule, CommonModule],
  templateUrl: './music-player.component.html',
  styleUrl: './music-player.component.css'
})
export class MusicPlayerComponent {
selectedArtist: string = 'All';
  selectedAlbum: string = 'All';

  songs = [
    { name: 'Shape of You', artist: 'Ed Sheeran', album: 'Divide', duration: '4:23', rating: 4.8 },
    { name: 'Blinding Lights', artist: 'The Weeknd', album: 'After Hours', duration: '3:21', rating: 4.9 },
    { name: 'Levitating', artist: 'Dua Lipa', album: 'Future Nostalgia', duration: '3:23', rating: 4.6 },
    { name: 'Perfect', artist: 'Ed Sheeran', album: 'Divide', duration: '4:40', rating: 4.7 },
    { name: 'Save Your Tears', artist: 'The Weeknd', album: 'After Hours', duration: '3:35', rating: 4.5 },
  ];

  get artists() {
    return ['All', ...new Set(this.songs.map(s => s.artist))];
  }

  get albums() {
    return ['All', ...new Set(this.songs.map(s => s.album))];
  }

  filteredSongs() {
    return this.songs.filter(song =>
      (this.selectedArtist === 'All' || song.artist === this.selectedArtist) &&
      (this.selectedAlbum === 'All' || song.album === this.selectedAlbum)
    );
  }
}