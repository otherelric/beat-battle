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

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    BattleComponent,
    PlaylistComponent,
    ExploreComponent,
    LogoutComponent,
    PlaylistBlockComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ UserServiceService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
