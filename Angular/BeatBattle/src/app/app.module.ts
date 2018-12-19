import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { BattleComponent } from './components/battle/battle.component';
import { PlaylistComponent } from './components/playlist/playlist.component';
import { ExploreComponent } from './components/explore/explore.component';
import { UserServiceService } from './services/user-service.service';
import { HttpClientModule } from '@angular/common/http';
import { LogoutComponent } from './components/logout/logout.component';
import { PlaylistBlockComponent } from './components/playlist-block/playlist-block.component';
import { SpotifyService } from './services/spotify.service';
import { BattleBlockComponent } from './components/battle-block/battle-block.component';
import { CreatePlaylistComponent } from './components/create-playlist/create-playlist.component';
import { CreateBattleComponent } from './components/create-battle/create-battle.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    BattleComponent,
    PlaylistComponent,
    ExploreComponent,
    LogoutComponent,
    PlaylistBlockComponent,
    BattleBlockComponent,
    CreatePlaylistComponent,
    CreateBattleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ UserServiceService, SpotifyService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
