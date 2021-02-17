import {Component, OnInit} from '@angular/core';
import {HttpClient, HttpClientModule, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {NgbAlert} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-request-sender',
  templateUrl: './request-sender.component.html',
  styleUrls: ['./request-sender.component.css']
})
export class RequestSenderComponent {
  inputNumber = '0';
  result = '';
  errorMessage: string;

  constructor(private http: HttpClient) {
  }

  send(): void {
    this.http.get('/api/get_exception?number=' + this.inputNumber).subscribe(
      (res) => {
        console.log(res);
        this.errorMessage = '';
        this.result = JSON.stringify(res);
      },
      error => {
        console.log(error.status);
        console.log(error.error);
        this.result = '';
        this.errorMessage = error.status + ' ' + error.error;
      }
    );
  }
}
