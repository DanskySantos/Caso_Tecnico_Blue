import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {NavComponent} from './nav/nav.component';
import {FormsModule} from "@angular/forms";
import {HomeComponent} from './home/home.component';
import {RegisterComponent} from './register/register.component';
import {ListsComponent} from './lists/lists.component';
import {SharedModule} from "./_modules/shared.module";
import {ErrorInterceptor} from "./_interceptors/error.interceptor";
import {NotFoundComponent} from './errors/not-found/not-found.component';
import {ServerErrorComponent} from './errors/server-error/server-error.component';
import { EnterprisesListComponent } from './enterprises-list/enterprises-list.component';
import { EnterprisesVoteComponent } from './enterprises-list/enterprises-vote/enterprises-vote.component';

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    HomeComponent,
    RegisterComponent,
    ListsComponent,
    NotFoundComponent,
    ServerErrorComponent,
    EnterprisesListComponent,
    EnterprisesVoteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    FormsModule,
    SharedModule
  ],
  providers: [
    {provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
