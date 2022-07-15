# songs-crud

Get List Songs
`GET | http://localhost:8080/api/songs`

```json
// 20220715100909
// http://localhost:8080/api/songs

[
  {
    "title": "Gajah",
    "author": "Tulus",
    "releaseYear": 2015
  },
  {
    "title": "Demi Waktu",
    "author": "Ungu",
    "releaseYear": 2010
  },
  {
    "title": "Padi",
    "author": "Mahadewi",
    "releaseYear": 1998
  }
]
```

GET List song by Year
`GET | http://localhost:8080/api/songs/year/2015`

```json
// 20220715101010
// http://localhost:8080/api/songs/year/2015

[
  {
    "title": "Gajah",
    "author": "Tulus",
    "releaseYear": 2015
  }
]
```