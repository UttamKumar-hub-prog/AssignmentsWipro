import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MovieListAppComponent } from './movie-list-app.component';

describe('MovieListAppComponent', () => {
  let component: MovieListAppComponent;
  let fixture: ComponentFixture<MovieListAppComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MovieListAppComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MovieListAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
