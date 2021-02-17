import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RequestSenderComponent } from './request-sender/request-sender.component';
import { HttpClientModule } from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import {NgbPaginationModule, NgbAlertModule} from '@ng-bootstrap/ng-bootstrap';

/**
 * https://stackoverflow.com/questions/37649164/how-to-add-bootstrap-to-an-angular-cli-project
 */
@NgModule({
  declarations: [
    AppComponent,
    RequestSenderComponent
  ],
  imports: [
    BrowserModule,
    NgbPaginationModule,
    NgbAlertModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
