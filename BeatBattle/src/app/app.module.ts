import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { BattleComponent } from './components/battle/battle.component';
import { PlaylistComponent } from './components/playlist/playlist.component';
import { ExploreComponent } from './components/explore/explore.component';
import { UserServiceService } from './services/user-service.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    BattleComponent,
    PlaylistComponent,
    ExploreComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [ UserServiceService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
