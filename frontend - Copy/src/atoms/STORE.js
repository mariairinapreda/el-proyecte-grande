import { atom } from "jotai";
import axios from "axios";

export const BASE_PATH = "http://localhost:8888";
export const USER_PATH = "http://localhost:8888/api/user";
export const ADMIN_PATH = "http://localhost:8888/api/admin";

export const USER = atom({
  token: undefined,
  id: undefined,
  name: undefined,
  roles: [],
});
export const CART_PRODUCTS = atom([]);
export const PRODUCTS = atom(axios.get(`${BASE_PATH}/products`).then(r=> r.data));
export const CART_PRODUCTS_NUMBER = atom(0);
export const ORDERS = atom([]);


export const SEARCH_TEXT = atom("");
