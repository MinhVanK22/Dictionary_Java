## My Dictionaty By Group 1-11

## Tên các thành viên:

- Dương Hữu Trường (Nhóm trưởng)
- Nguyễn Minh Văn
- Nguyễn Hoàng Tú
- Nguyễn Tuấn Anh

## Demo

![demo](https://user-images.githubusercontent.com/108819897/184878463-2782aceb-e8dc-4283-935d-f1d901e13bb1.jpg)

## Library

[Soure Lib](https://sourceforge.net/projects/freetts/files/)

![LIB](https://user-images.githubusercontent.com/108819897/184878859-2e387937-8109-4a68-8e47-06244cc2be6b.png)

## Main features

- Thêm từ:
```sh
  Thêm từ vào trong listAdded:
   + Từ đã được thêm trước đây: sửa nghĩa
   + Từ chưa được thêm : thêm từ.
   + Từ trong listAdded khi tra cứu thì nghĩa sẽ được hiển thị cùng nghĩa của dữ liệu.
```
- Sửa từ:
```sh
  Điều chỉnh từ lần lượt theo các nguyên tắc:
    + Nếu từ đã chỉnh sửa trước đây (nằm trong listModified) thì chỉnh sửa phần giải thích trong listModified
    + Nếu từ chưa từng chỉnh sửa, thêm nghĩa mới cho từ và thêm từ đó vào trong listModified.
    + Nếu không có trong danh sách chỉnh sửa hoặc trong dữ liệu thì thông báo "Chưa có dữ liệu về từ này!"
```
- Xóa từ:
```sh
  Xóa từ theo nguyên tắc:
   + Nếu là từ đã xóa thì thông báo cho người dùng, kết thức hàm.
   + Nếu là từ trong danh sách chỉnh sửa thì xóa từ đó khỏi danh sách chỉnh sửa.
   + Nếu từ đó chỉ cỏ trong dữ liệu ( file dictionaries ) thì thêm từ đó vào danh sách từ đã xóa
   + Khi tìm kiếm dựa vào dánh sách này để không hiển thị nữa
```
- Tra từ:
```sh
  Tra từ lần lượt theo các nguyên tắc:
   + Nếu từ trong danh sách từ đã xóa, chỉ hiển thị nghĩa của tôi
   + Hiển thị từ trong danh sách "Từ của tôi" trước
   + Hiển thị nghĩa chỉnh sửa nếu có (được lưu trong listModified)
   + Nếu từ không được lưu trong listModified: hiển thị từ lưu trong dữ liệu - tức file dictionaries.
   + Nếu từ không có trong dữ liệu, in ra thông báo.
```
- Phát âm tiếng anh: Phát âm từ tiếng anh được chọn sử dụng thư viện phát âm của Java
- Giao đồ họa thân thiện và dễ sử dụng tích hợp các tính năng cơ bản trên, ngoài ra còn có thêm tính năng: Gợi ý từ đang tra, dịch văn bản bằng Google Translate API.
- Sử dụng thuật tìm nhị phân

## Used API

- Google Translate API: online traslate [Soure API](https://script.google.com/macros/s/AKfycbzzimSXyRhh4zy2rePQ-cTwisM1WdYZRVc1x1UVRj0-NCV2DHkprugTqvoOsh95APWy/exec)
