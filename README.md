# Dik Üçgen Hipotenüs Hesaplama Programı

Bu Java programı, kullanıcıdan alınan iki kenar uzunluğunu kullanarak dik üçgenin hipotenüsünü hesaplar. Program Pisagor teoremini (`c² = a² + b²`) kullanarak hesaplama yapar.

## Özellikler

- Kullanıcıdan iki kenar uzunluğunu alır
- Double veri tipi kullanarak hassas hesaplama yapar
- Pisagor teoremini kullanarak hipotenüsü hesaplar
- Sonucu ekrana yazdırır

## Gereksinimler

- Java JDK 8 veya üzeri
- Java çalışma ortamı (IDE önerisi: Eclipse, IntelliJ IDEA veya VS Code)

## Kurulum

1. Bu repository'yi bilgisayarınıza klonlayın:
```bash
git clone https://github.com/kullaniciadi/UcgenHesaplama.git
```

2. Proje dizinine gidin:
```bash
cd UcgenHesaplama
```

3. Java dosyasını derleyin:
```bash
javac Ucgen.java
```

4. Programı çalıştırın:
```bash
java Ucgen
```

## Kullanım

1. Program başladığında, ilk kenar uzunluğunu girin
2. İkinci kenar uzunluğunu girin
3. Program otomatik olarak hipotenüsü hesaplayıp ekrana yazdıracaktır

Örnek çalıştırma:
```
Dik üçgenin iki kenar uzunluğunu girin:
Kenar a: 3
Kenar b: 4
Dik üçgenin hipotenüsü: 5.0
```

## Matematiksel Temel

Program, Pisagor teoremini kullanır:
- c² = a² + b²
- c = √(a² + b²)

Burada:
- c: Hipotenüs uzunluğu
- a: Birinci dik kenar uzunluğu
- b: İkinci dik kenar uzunluğu

## Katkıda Bulunma

1. Bu repository'yi fork edin
2. Feature branch'i oluşturun (`git checkout -b feature/YeniOzellik`)
3. Değişikliklerinizi commit edin (`git commit -am 'Yeni özellik eklendi'`)
4. Branch'inizi push edin (`git push origin feature/YeniOzellik`)
5. Pull Request oluşturun

## Planlanan Geliştirmeler

- [ ] Negatif sayı kontrolü
- [ ] Büyük sayılar için kontrol
- [ ] Hata yakalama mekanizması
- [ ] Üçgenin alanını hesaplama özelliği
- [ ] Grafik arayüz eklenmesi
