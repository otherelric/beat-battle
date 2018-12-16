import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from 'src/app/components/login/login.component';
import { BattleComponent } from 'src/app/components/battle/battle.component';
import { PlaylistComponent } from 'src/app/components/playlist/playlist.component';
import { ExploreComponent } from 'src/app/components/explore/explore.component';

const routes: Routes = [
  { path: 'explore', component: ExploreComponent },
  { path: 'battle', component: BattleComponent },
  { path: 'playlist', component: PlaylistComponent },
  { path: 'login', component: LoginComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
